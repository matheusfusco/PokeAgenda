package com.fiap.rm45401.pokeagenda.api

import com.fiap.rm45401.pokeagenda.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by logonrm on 21/02/2018.
 */

interface PokemonAPI {
    @GET("/api/v2/pokemon/{numero}")
    fun buscarPokemon(@Path("numero") numeroPokemon: Int) : Call<Pokemon>
}