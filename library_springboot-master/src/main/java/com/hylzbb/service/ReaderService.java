package com.hylzbb.service;

import com.hylzbb.entity.Reader;

import java.util.List;

public interface ReaderService {
    List<Reader> getReaderList(String name, String id);

    boolean login(String id, String password);

    Reader findReader(String id);

    boolean haveReader(String id);

    int addReader(Reader reader);

    int updateReader(Reader reader);

    int deleteAdminById(String id);
}
