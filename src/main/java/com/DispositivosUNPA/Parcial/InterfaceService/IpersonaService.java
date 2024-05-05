package com.DispositivosUNPA.Parcial.InterfaceService;

import java.util.List;
import java.util.Optional;
import com.DispositivosUNPA.Parcial.Model.Persona;

public interface IpersonaService {
    public List<Persona> listar();

    public Optional<Persona> listarId(int id);

    public int save(Persona u);

    public void delete(int id);
}
