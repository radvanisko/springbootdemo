package sk.radvanisko.springbootdemo.service;

import sk.radvanisko.springbootdemo.model.Vydavok;

import java.util.List;

public interface VydavokService {
    List<Vydavok> getAllrecords ();
    Vydavok ulozvydavok (Vydavok vydavok);
    Vydavok getVydavokId (Long id);
    void  deleteVydavokId (Long id);

}
