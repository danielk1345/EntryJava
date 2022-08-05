package com.example.EntryProject.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/entry")
public class EntryController {

    private final EntryService entryService;

    @Autowired
    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    @GetMapping
    public List<Entry> getEntries() {
        return entryService.getEntries();
    }

    @PostMapping
    public void addEntry(@RequestBody Entry entry) {
        entryService.addNewEntry(entry);
    }

    @DeleteMapping(path = "{entryId}")
    public void deleteEntry(@PathVariable("entryId") Long id) {
        entryService.deleteExistEntry(id);
    }
}
