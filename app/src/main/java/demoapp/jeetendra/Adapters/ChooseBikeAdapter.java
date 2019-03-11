package demoapp.jeetendra.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

import demoapp.jeetendra.R;
import demoapp.jeetendra.models.ModelBike;
import demoapp.jeetendra.models.ModelVCI;

public class ChooseBikeAdapter extends RecyclerView.Adapter<ChooseBikeAdapter.VciViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
  //  private List<ModelVCI> vciList;
    private List<ModelBike> bikeList;

    //getting the context and product list with constructor
    public ChooseBikeAdapter(Context mCtx, List<ModelBike> bikeList) {
        this.mCtx = mCtx;
        this.bikeList = bikeList;
    }
    @Override
    public VciViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_row_bike, null);
        return new VciViewHolder(view);
    }
    @Override
    public void onBindViewHolder(VciViewHolder holder, int position) {
        //getting the product of the specified position
        final ModelBike product = bikeList.get(position);

        //binding the data with the viewholder views
       // holder.textViewTitle.setText(product.getChoosebike());

        Glide.with(holder.itemView.getContext())
                .load(bikeList.get(position).getChoosebike())
                .into(holder.iv);
    }


    @Override
    public int getItemCount() {
        return bikeList.size();
    }

    class VciViewHolder extends RecyclerView.ViewHolder {

        //TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
       // RelativeLayout rl_vci;

        ImageView iv;

        public VciViewHolder(View itemView) {
            super(itemView);

            //textViewTitle = itemView.findViewById(R.id.textViewTitle);
           // rl_vci = itemView.findViewById(R.id.rl_vci);
            iv = itemView.findViewById(R.id.iv_bike);

        }
    }

}
