package icarus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import icarus.model.Imoveis;

public interface ImovelRepository extends JpaRepository<Imoveis, Long>{

}
