package com.example.bitirmeprojesi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import coil.load
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.item_image.view.*

class SecondFragment : Fragment(R.layout.fragment_second) {
    private val args by navArgs<SecondFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //textView3.text = args.sendDataClass.name

        //itemView.imageViewBanner.load(data.banner)

        imageViewBanner2.load(args.sendDataClass.banner)
        textViewDescription.text = args.sendDataClass.description
        textViewLeaderName.text = "LEADER NAME: \n ${args.sendDataClass.leader.name}"
        imageViewLeaderPhoto.load(args.sendDataClass.leader.photo)

        /*button.setOnClickListener {
            val url = "http://www.stackoverflow.com"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }*/

        imageViewInstagram.setOnClickListener {
            val url = args.sendDataClass.links?.instagram
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        imageViewTwitter.setOnClickListener {
            val url = args.sendDataClass.links?.twitter
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        imageViewYoutube.setOnClickListener {
            val url = args.sendDataClass.links?.youtube
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        imageViewParticipation.setOnClickListener {
            val url = args.sendDataClass.links?.participation
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

    }
}