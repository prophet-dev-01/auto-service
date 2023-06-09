package project.autoservice.mapper.impl;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import project.autoservice.mapper.ModelMapper;
import project.autoservice.model.Car;
import project.autoservice.model.Owner;
import project.autoservice.model.dto.request.CarRequestDto;
import project.autoservice.model.dto.response.CarResponseDto;
import project.autoservice.service.OwnerService;

@RequiredArgsConstructor
@Component
public class CarMapper implements ModelMapper<Car, CarResponseDto, CarRequestDto> {
    private final OwnerService ownerService;

    @Override
    public Car toModel(CarRequestDto request) {
        Car car = new Car();
        car.setModel(request.getModel());
        car.setOwner(request.getOwnerId() == null
                ? null
                : ownerService.findById(request.getOwnerId()));
        car.setBrand(request.getBrand());
        car.setLicensePlate(request.getLicensePlate());
        car.setYearOfManufacturer(request.getYearOfManufacturer());
        return car;
    }

    @Override
    public CarResponseDto toDto(Car car) {
        CarResponseDto carResponseDto = new CarResponseDto();
        carResponseDto.setId(car.getId());
        carResponseDto.setBrand(car.getBrand());
        carResponseDto.setModel(car.getModel());
        carResponseDto.setLicensePlate(car.getLicensePlate());
        carResponseDto.setYearOfManufacturer(car.getYearOfManufacturer());
        carResponseDto.setOwnerId(
                Optional.ofNullable(car.getOwner())
                        .map(Owner::getId).orElse(null));
        return carResponseDto;
    }
}
