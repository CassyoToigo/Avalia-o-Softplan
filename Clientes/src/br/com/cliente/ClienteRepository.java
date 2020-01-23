package br.com.cliente;

import java.util.List;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
     
    @Query(value = "SELECT c FROM cliente c WHERE c.nome LIKE '%' || :keyword || '%'"
            + " OR c.sexo LIKE '%' || :keyword || '%'"
            + " OR c.endereco LIKE '%' || :keyword || '%'")
    public List<Cliente> search(@Param("keyword") String keyword);
}