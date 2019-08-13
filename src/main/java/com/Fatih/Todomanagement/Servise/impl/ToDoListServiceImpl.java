package com.Fatih.Todomanagement.Servise.impl;

import com.Fatih.Todomanagement.Entity.ToDoList;
import com.Fatih.Todomanagement.Repository.ToDoListRepository;
import com.Fatih.Todomanagement.Servise.ToDoListService;
import com.Fatih.Todomanagement.dto.ToDoListDto;
import com.Fatih.Todomanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ToDoListServiceImpl implements ToDoListService {

    private final ToDoListRepository ToDoListRepository;
    private final ModelMapper modelMapper;

    public ToDoListServiceImpl(ToDoListRepository toDoListRepository, ModelMapper modelMapper) {
        this.ToDoListRepository = toDoListRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ToDoList save(ToDoList toDoList) {
        return ToDoListRepository.save(toDoList);
    }

    @Override
    public ToDoListDto save(ToDoListDto toDoList) {
        if (toDoList.getDate() == null)
            throw new IllegalArgumentException("ToDoList Date cannot be null");

        ToDoList ToDoDb = modelMapper.map(toDoList, ToDoList.class);

        ToDoDb = ToDoListRepository.save(ToDoDb);
        return modelMapper.map(ToDoDb, ToDoListDto.class);
    }

    @Override
    public ToDoList getById(Long id) {
        return ToDoListRepository.getOne(id);
    }

    @Override
    public TPage<ToDoListDto> getAllPageable(Pageable pageable) {
    Page<ToDoList> data=ToDoListRepository.findAll(pageable);
    TPage page=new TPage<ToDoListDto>();
    ToDoListDto[] dtos=modelMapper.map(data.getContent(),ToDoListDto[].class);
    page.setStat(data, Arrays.asList(dtos));
    return page;
    }

    @Override
    public Boolean delete(ToDoListDto toDoList) {
        return null;
    }

    @Override
    public Boolean delete(ToDoList toDoList) {
        return null;
    }
}
