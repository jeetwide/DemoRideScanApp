package demoapp.jeetendra.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import demoapp.jeetendra.R;
import demoapp.jeetendra.models.ModelVCI;

public class VciAdapter extends RecyclerView.Adapter<VciAdapter.VciViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<ModelVCI> vciList;

    //getting the context and product list with constructor
    public VciAdapter(Context mCtx, List<ModelVCI> vciList) {
        this.mCtx = mCtx;
        this.vciList = vciList;
    }
    @Override
    public VciViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_row_vci, null);
        return new VciViewHolder(view);
    }
    @Override
    public void onBindViewHolder(VciViewHolder holder, int position) {
        //getting the product of the specified position
        final ModelVCI product = vciList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getVciTitle());

        holder.rl_vci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mCtx, product.getVciTitle()+" Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public int getItemCount() {
        return vciList.size();
    }

    class VciViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        RelativeLayout rl_vci;

        public VciViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            rl_vci = itemView.findViewById(R.id.rl_vci);

        }
    }

}
