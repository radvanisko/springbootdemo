package sk.radvanisko.springbootdemo.service;

import org.springframework.stereotype.Service;
import sk.radvanisko.springbootdemo.model.Vydavok;
import sk.radvanisko.springbootdemo.repository.VydavokRepository;

import java.util.List;

@Service


public class VydavokServiceImplement implements VydavokService {


    private VydavokRepository vydavokRepository;

    public VydavokServiceImplement(VydavokRepository vydavokRepository) {
        this.vydavokRepository = vydavokRepository;
    }

     @Override
    public List<Vydavok> getAllrecords() {
        return vydavokRepository.findAll();
    }

    @Override
    public Vydavok ulozvydavok(Vydavok vydavok) {

        return vydavokRepository.save(vydavok);
    }

    @Override
    public Vydavok getVydavokId(Long id) {
        return null;
    }

    @Override
    public void deleteVydavokId(Long id) {

    }


}
