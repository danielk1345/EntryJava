package com.example.EntryProject.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {

    private final EntryRepository entryRepository;

    @Autowired
    public EntryService(EntryRepository entryRepository){
        this.entryRepository = entryRepository;
    }
    public List<Entry> getEntries() {
        return entryRepository.findAll();
    }

    public void addNewEntry(Entry entry) {
        entryRepository.save(entry);
    }

    public void deleteExistEntry(Long entryId) {
        boolean present = entryRepository.existsById(entryId);
        if (!present) {
            throw new IllegalStateException("Entry does not exist");
        } else {
            entryRepository.deleteById(entryId);
        }
    }
}
