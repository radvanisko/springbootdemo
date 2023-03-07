package sk.radvanisko.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.radvanisko.springbootdemo.model.Vydavok;

public interface VydavokRepository extends JpaRepository<Vydavok,Long> {


}
