package com.bisai.bisai.controller.managers;

import com.bisai.bisai.model.Jugador;
import java.util.List;

/**
 * Created by ivan on 18/4/17.
 */

public interface JugadorCallback {
    void onSuccess(List<Jugador> jugadorList);
    void onSuccess();
    void onSuccess(Jugador jugador);
    void onFailure(Throwable t);
}
