package com.example.aulacomponenteslistagem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

// Quando usamos <> dentro dele indicará o tipo que será nossa classe
// Neste caso, a classe Adapter obriga a receber uma classe do tipo ViewHolder entre <>
class MensagemAdapter(private val lista: List<Mensagem>) :
    Adapter<MensagemAdapter.MensagemViewHolder>() {

    /*//ViewHolder é onde iremos armazenar o nosso layout
    //E este layout será associado
    //A nossa ViewHolder extenderá de ViewHolder e passaremos o parâmetro do tipo View
    //Onde extendemos de ViewHolder, neste caso será o parâmetro itemView*/
    inner class MensagemViewHolder(itemView: View) : ViewHolder(itemView) {

        /*//Id's do xml, aula recycler view
        val textName: TextView = itemView.findViewById(R.id.text_name)
        val textMensage: TextView = itemView.findViewById(R.id.text_mensage)
        val imagePerfil: ImageView = itemView.findViewById(R.id.image_perfil)*/
        //Id's do xml, aula card view
        val textName: TextView = itemView.findViewById(R.id.text_card_name)
        val textMensage: TextView = itemView.findViewById(R.id.text_card_mensage)


        //val textHour: TextView = itemView.findViewById(R.id.text_hour)
        val imagePerfil: ImageView = itemView.findViewById(R.id.image_card_perfil)
    }

    //On Create View Holder = Ao criar o armazenar a view
    //Aqui criaremos a nossa visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        //Aqui precisamos passar um XML para que seja convertido numa view
        //Precisamos um inflater para utlizarmos a nossa view
        val layoutInflater = LayoutInflater.from(parent.context)

        //val itemView = layoutInflater.inflate(R.layout.item_lista, parent, false)
        val itemView = layoutInflater.inflate(R.layout.item_card_view, parent, false)

        //Precisamos retornar uma instancia de ViewHolder
        return MensagemViewHolder(itemView)
    }

    //Ao vincula os dados com a visualização
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {

        val mensagem = lista[position]
        holder.textName.text = mensagem.name
        holder.textMensage.text = mensagem.mensagem
        //holder.textHour.text = mensagem.hour
    }

    //Recupera a quantidade de itens
    //Aqui passamos a quantidade de itens para que possa criar
    //No caso, será o tamanho da nossa lista
    override fun getItemCount(): Int {
        return lista.size
    }

}