package com.DispositivosUNPA.Parcial.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DispositivosUNPA.Parcial.Interface.Ipersona;
import com.DispositivosUNPA.Parcial.InterfaceService.IpersonaService;
import com.DispositivosUNPA.Parcial.Model.Persona;

@Service
public class PersonaServices implements IpersonaService {

    @Autowired
    private Ipersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Persona u) {
        int res = 0;
        Persona per = data.save(u);
        if (!per.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
