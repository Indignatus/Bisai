package com.bisai.bisai.controller.activities.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bisai.bisai.R;
import com.bisai.bisai.controller.managers.JugadorCallback;
import com.bisai.bisai.controller.managers.JugadorManager;
import com.bisai.bisai.model.Jugador;

import java.util.List;

/**
 * Created by dam on 18/4/17.
 */

public class JugadorDetailFragment extends Fragment implements JugadorCallback {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The player content this fragment is presenting.
     */
    private Jugador mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public JugadorDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            String id = getArguments().getString(ARG_ITEM_ID);
            mItem = JugadorManager.getInstance().getJugador(id);
            assert mItem != null;
            final Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(android.support.v7.appcompat.R.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getNombre());
            }
            FloatingActionButton edit = (FloatingActionButton) activity.findViewById(R.id.edit);
            edit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), AddEditActivity.class); // intent en fragments
                    intent.putExtra("id", mItem.getId().toString());
                    intent.putExtra("type", "edit");
                    startActivityForResult(intent, 0);
                }
            });
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jugador_detail, container, false);
        Button delete = (Button) rootView.findViewById(R.id.deleteButton);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JugadorManager.getInstance().deleteAthlete(JugadorDetailFragment.this, mItem.getId());
                Intent intent = new Intent(v.getContext(), JugadoresListActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

    @Override
    public void onSuccess(List<Jugador> jugadorList) {

    }

    @Override
    public void onSucces() {

    }

    @Override
    public void onSucces(Jugador jugador) {

    }

    @Override
    public void onFailure(Throwable t) {

    }
}
