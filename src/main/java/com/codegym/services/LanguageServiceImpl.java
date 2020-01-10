package com.codegym.services;

import com.codegym.models.Language;
import com.codegym.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LanguageServiceImpl implements ILanguageService {
    @Autowired
    LanguageRepository languageRepository;
    @Override
    public Iterable<Language> findAllLanguage() {
        return languageRepository.findAll();
    }

    @Override
    public Optional<Language> findById(Long id) {
        return languageRepository.findById(id);
    }

    @Override
    public void save(Language language) {
        languageRepository.save(language);
    }

    @Override
    public void remote(Long id) {
        languageRepository.deleteById(id);
    }
}