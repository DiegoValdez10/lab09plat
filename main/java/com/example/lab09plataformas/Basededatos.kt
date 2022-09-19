package com.example.lab09plataformas
import java.io.Serializable

data class personaje(
    val nombre: String,
    val especie: String,
    val status: String,
    val genero: String,
    val imagen: String
):Serializable
object  Basededatos {
    private val personajes = mutableListOf(
        personaje(
            nombre = "Rick Sanchez",
            status = "Alive",
            especie = "Human",
            genero = "Male",
            imagen = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
        ),
        personaje(
            nombre = "Morty Smith",
            status = "Alive",
            especie = "Human",
            genero = "Male",
            imagen = "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
        ),
        personaje(
            nombre = "Summer Smith",
            status = "Alive",
            especie = "Human",
            genero = "Female",
            imagen = "https://rickandmortyapi.com/api/character/avatar/3.jpeg",
        ),
        personaje(
            nombre = "Beth Smith",
            status = "Alive",
            especie = "Human",
            genero = "Female",
            imagen = "https://rickandmortyapi.com/api/character/avatar/4.jpeg",
        ),
        personaje(
            nombre = "Jerry Smith",
            status = "Alive",
            especie = "Human",
            genero = "Male",
            imagen = "https://rickandmortyapi.com/api/character/avatar/5.jpeg",
        ),
        personaje(
            nombre = "Abadango Cluster Princess",
            status = "Alive",
            especie = "Alien",
            genero = "Female",
            imagen = "https://rickandmortyapi.com/api/character/avatar/6.jpeg",
        ),
        personaje(
            nombre = "Abradolf Lincler",
            status = "unknown",
            especie = "Human",
            genero = "Male",
            imagen = "https://rickandmortyapi.com/api/character/avatar/7.jpeg",
        ),
        personaje(
            nombre = "Adjudicator Rick",
            status = "Dead",
            especie = "Human",
            genero = "Male",
            imagen = "https://rickandmortyapi.com/api/character/avatar/8.jpeg",
        ),
        personaje(
            nombre = "Agency Director",
            status = "Dead",
            especie = "Human",
            genero = "Male",
            imagen = "https://rickandmortyapi.com/api/character/avatar/9.jpeg",
        ),
        personaje(
            nombre = "Alan Rails",
            status = "Dead",
            especie = "Human",
            genero = "Male",
            imagen = "https://rickandmortyapi.com/api/character/avatar/10.jpeg",
        ),
    )

    fun getCharacters() = personajes

}
