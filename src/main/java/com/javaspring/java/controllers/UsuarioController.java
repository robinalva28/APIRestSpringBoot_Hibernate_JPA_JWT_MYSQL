package com.javaspring.java.controllers;

import com.javaspring.java.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Robinson");
        usuario.setApellido("Alvarez");
        usuario.setEmail("robinnet28@gmail.com");
        usuario.setTelefono("1164897700");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Robinson");
        usuario.setApellido("Alvarez");
        usuario.setEmail("robinnet28@gmail.com");
        usuario.setTelefono("1164897700");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Alejandro");
        usuario2.setApellido("Mogollón");
        usuario2.setEmail("alehjandro@gmail.com");
        usuario2.setTelefono("1133445500");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Sofía");
        usuario3.setApellido("Mariorca");
        usuario3.setEmail("sofia@gmail.com");
        usuario3.setTelefono("1164444555");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;

    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Robinson");
        usuario.setApellido("Alvarez");
        usuario.setEmail("robinnet28@gmail.com");
        usuario.setTelefono("1164897700");
        return usuario;
    }
    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Robinson");
        usuario.setApellido("Alvarez");
        usuario.setEmail("robinnet28@gmail.com");
        usuario.setTelefono("1164897700");
        return usuario;
    }
}
