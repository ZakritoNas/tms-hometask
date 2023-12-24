package com.example.lesson45il.mapper;

import com.example.lesson45il.dto.IlError;
import com.example.lesson45il.exc.CarFailedException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ErrorMapper {

@Mapping(target= "message", source = "message")
@Mapping(target= "service", source = "service")
@Mapping(target= "action", constant = "find car")
IlError toil(CarFailedException exc);

}
