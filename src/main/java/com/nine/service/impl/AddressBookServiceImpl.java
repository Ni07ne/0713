package com.nine.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nine.entity.AddressBook;
import com.nine.mapper.AddressBookMapper;
import com.nine.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
