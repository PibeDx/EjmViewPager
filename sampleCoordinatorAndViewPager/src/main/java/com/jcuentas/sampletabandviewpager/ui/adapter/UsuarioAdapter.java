package com.jcuentas.sampletabandviewpager.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jcuentas.sampletabandviewpager.R;

/**
 * Created by Jose Cuentas Turpo on 17/07/2015 - 09:44 AM.
 * E-mail: jcuentast@gmail.com
 */
public class UsuarioAdapter extends  RecyclerView.Adapter<UsuarioAdapter.UsuarioHolder>{
    private Context mContext;
    private int itemCount = 10;

    public UsuarioAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return itemCount;
    }

    @Override
    public UsuarioHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View artistView = LayoutInflater.from(mContext)
                .inflate(R.layout.item_usuario, parent, false);
        return new UsuarioHolder(artistView);
    }

    @Override
    public void onBindViewHolder(UsuarioHolder holder, int position) {

    }

    public class UsuarioHolder extends RecyclerView.ViewHolder {
        private TextView txvNombre, txvApellidos, txvEdad;


        public UsuarioHolder(View itemView) {
            super(itemView);
            txvNombre = (TextView) itemView.findViewById(R.id.txvNombre);
            txvApellidos = (TextView) itemView.findViewById(R.id.txvApellido);
            txvEdad = (TextView) itemView.findViewById(R.id.txvEdad);
        }
    }
}
