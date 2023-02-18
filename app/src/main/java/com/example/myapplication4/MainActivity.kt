package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import com.example.myapplication4.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val arrayAdapter: ArrayAdapter<*>
//        val users = arrayOf("Virat Kohli", "Rohit Sharma", "Steve Smith","Kane Williamson", "Ross Taylor")
//        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, users)
//        mListView.adapter = arrayAdapter

        var mListView = findViewById<ListView>(R.id.mainlist)
        val itemList = mutableListOf<String>()
        var k = 0

            itemList.add(
                k++,
                "Thyroid problem: థైరాయిడ్ సమస్య ఉన్నవారు వీటికి దూరంగా ఉండటమే మంచిది.. లేదంటే మాత్రం.."
            )
            itemList.add(
                k++,
                "Tractor Powered Cow Dung: ప్రపంచంలోనే తొలిసారిగా ఆవు పేడతో నడిచే ట్రాక్టర్.. సంచలన ఆవిష్కరణ చేసిన శాస్త్రవేత్తలు.."
            )
            itemList.add(
                k++,
                "Health Tips: గరిక గడ్డి రసాన్ని ఇలా ఉపయోగిస్తే.. సంతానం లేని దంపతులకు సంతానం కలుగుతుందా.."
            )
            itemList.add(
                k++,
                "Mahila Naga Sadhu: మహిళా నాగ సాధువులు నగ్నంగా ఉంటారా.. వీరి జీవితం లో ఎన్ని కష్టాలు ఉంటాయో తెలుసా.."
            )
            itemList.add(
                k++,
                "Friday Don’t : శుక్రవారం రోజు అసలు చేయకూడని పనులు ఇవే.. చేస్తే మాత్రం లక్ష్మీదేవి ఆగ్రహానికి.."
            )
            itemList.add(
                k++,
                "Heart Attack And Peanuts:గుండెపోటుకి పల్లీలకి గల సంబంధం ఏమిటి? మైండ్ బ్లాక్ అయ్యే వాస్తవాలు."
            )
            itemList.add(
                k++,
                "Telugu Health Tips:ఎండు ద్రాక్షను ఈ పద్ధతిలో తింటే త్వరగా.. రక్తహీనత సమస్య నుంచి బయటపడవచ్చు."
            )
            itemList.add(
                k++,
                "Delhi Crime: ప్రియురాలిని దారుణంగా చంపి.. ఫ్రిజ్ లో దాచిన ప్రియుడు.."
            )
            itemList.add(
                k++,
                "CM Jagan: ఈ రోజు వైయస్ఆర్ జిల్లా లో స్టీల్ ప్లాంట్ కు భూమి పూజ చేయనున్న.. సీఎం జగన్.. పూర్తి షెడ్యూల్ ఇదే.."
            )
            itemList.add(
                k++,
                "Health Tips: భోజనం చేసిన తర్వాత నడకతో.. అన్ని ఆరోగ్య ప్రయోజనాలు ఉన్నాయా.. వైద్య నిపుణులు ఏం చెబుతున్నారంటే.."
            )
            itemList.add(
                k++,
                "Valentine’s Day Special: ప్రేమ వివాహాలు చేసుకున్న మన టాలీవుడ్ హీరోలు వీళ్లే..!"
            )
            itemList.add(
                k++,
                "Skin Care Tips :ఈ అలవాట్లను దూరం చేసుకోకపోతే.. 40 సంవత్సరాలకే వృద్ధాప్య లక్షణాలు.."
            )
            itemList.add(
                k++,
                "Viral news: ఆ దేశంలో పక్షుల వింత ప్రవర్తన.. ప్రళయానికి సంకేతం అని ఆందోళన చెందుతున్న ప్రజలు.. వీడియో వైరల్.."
            )
            itemList.add(k++, "Japan womens: జపాన్ అమ్మాయిల అందానికి కారణమేంటో తెలుసా..")
            itemList.add(
                k++,
                "First night: మొదటి రాత్రి గదిలో మల్లెపూలతో.. అలంకరించడానికి గల కారణం ఏమిటో తెలుసా.."
            )
            itemList.add(
                k++,
                "Viral video: ఇలాంటి క్యాచ్ నెవర్ బిఫోర్ ఎవర్ ఆఫ్టర్.. వీడియో వైరల్.."
            )
            itemList.add(
                k++,
                "Health Tips : శరీరంలోని ఈ అవయవాలను పోలి ఉన్న పండ్లను తింటే.. ఎన్నో రకాల ఆరోగ్య సమస్యలు దూరం.."
            )
            itemList.add(k++,"Heart Attack And Peanuts:గుండెపోటుకి పల్లీలకి గల సంబంధం ఏమిటి? మైండ్ బ్లాక్ అయ్యే వాస్తవాలు..")
            itemList.add(k++,"Mahashivratri:మహా శివరాత్రి రోజు చేయాల్సిన చేయకూడని పనులు ఇవే..")
            itemList.add(k++,"Viral news: వామ్మో ఆమెంది సామీ అలా దూకేసింది..చీర కట్టులో..వీడియో వైరల్..")
//            val adapter = listadapter(itemList, this)
//            val listView = findViewById<ListView>(R.id.mainlist)
//            listView.adapter = adapter

        val items = listOf(
            Pair("Thyroid problem: థైరాయిడ్ సమస్య ఉన్నవారు వీటికి దూరంగా ఉండటమే మంచిది.. లేదంటే మాత్రం..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230217_235908-150x150.jpg"),
            Pair("Tractor Powered Cow Dung: ప్రపంచంలోనే తొలిసారిగా ఆవు పేడతో నడిచే ట్రాక్టర్.. సంచలన ఆవిష్కరణ చేసిన శాస్త్రవేత్తలు..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230217_195153-150x150.jpg"),
            Pair("Health Tips: గరిక గడ్డి రసాన్ని ఇలా ఉపయోగిస్తే.. సంతానం లేని దంపతులకు సంతానం కలుగుతుందా..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230217_174843-150x150.jpg"),
            Pair("Mahila Naga Sadhu: మహిళా నాగ సాధువులు నగ్నంగా ఉంటారా.. వీరి జీవితం లో ఎన్ని కష్టాలు ఉంటాయో తెలుసా..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230217_164812-150x150.jpg"),
            Pair("Friday Don’t : శుక్రవారం రోజు అసలు చేయకూడని పనులు ఇవే.. చేస్తే మాత్రం లక్ష్మీదేవి ఆగ్రహానికి..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230217_085626-150x150.jpg"),
            Pair("Heart Attack And Peanuts:గుండెపోటుకి పల్లీలకి గల సంబంధం ఏమిటి? మైండ్ బ్లాక్ అయ్యే వాస్తవాలు..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230212_191323-150x150.jpg"),
            Pair("Telugu Health Tips:ఎండు ద్రాక్షను ఈ పద్ధతిలో తింటే త్వరగా.. రక్తహీనత సమస్య నుంచి బయటపడవచ్చు..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230215_215851-150x150.jpg"),
            Pair("Delhi Crime: ప్రియురాలిని దారుణంగా చంపి.. ఫ్రిజ్ లో దాచిన ప్రియుడు..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230215_112024-150x150.jpg"),
            Pair("CM Jagan: ఈ రోజు వైయస్ఆర్ జిల్లా లో స్టీల్ ప్లాంట్ కు భూమి పూజ చేయనున్న.. సీఎం జగన్.. పూర్తి షెడ్యూల్ ఇదే..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230215_085847-150x150.jpg"),
            Pair("Health Tips: భోజనం చేసిన తర్వాత నడకతో.. అన్ని ఆరోగ్య ప్రయోజనాలు ఉన్నాయా.. వైద్య నిపుణులు ఏం చెబుతున్నారంటే..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230214_220253-150x150.jpg"),
            Pair("Valentine’s Day Special: ప్రేమ వివాహాలు చేసుకున్న మన టాలీవుడ్ హీరోలు వీళ్లే..!", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230214_210543-150x150.jpg"),
            Pair("Skin Care Tips :ఈ అలవాట్లను దూరం చేసుకోకపోతే.. 40 సంవత్సరాలకే వృద్ధాప్య లక్షణాలు..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230214_173801-150x150.jpg"),
            Pair("Viral news: ఆ దేశంలో పక్షుల వింత ప్రవర్తన.. ప్రళయానికి సంకేతం అని ఆందోళన చెందుతున్న ప్రజలు.. వీడియో వైరల్..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230214_164217-150x150.jpg"),
            Pair("Japan womens: జపాన్ అమ్మాయిల అందానికి కారణమేంటో తెలుసా..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230213_221558-150x150.jpg"),
            Pair("First night: మొదటి రాత్రి గదిలో మల్లెపూలతో.. అలంకరించడానికి గల కారణం ఏమిటో తెలుసా..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230213_220842-150x150.jpg"),
            Pair("Viral video: ఇలాంటి క్యాచ్ నెవర్ బిఫోర్ ఎవర్ ఆఫ్టర్.. వీడియో వైరల్..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230213_184558-150x150.jpg"),
            Pair("Health Tips : శరీరంలోని ఈ అవయవాలను పోలి ఉన్న పండ్లను తింటే.. ఎన్నో రకాల ఆరోగ్య సమస్యలు దూరం..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230212_231704-150x150.jpg"),
            Pair("Heart Attack And Peanuts:గుండెపోటుకి పల్లీలకి గల సంబంధం ఏమిటి? మైండ్ బ్లాక్ అయ్యే వాస్తవాలు..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230212_191323-150x150.jpg"),
            Pair("Mahashivratri:మహా శివరాత్రి రోజు చేయాల్సిన చేయకూడని పనులు ఇవే..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230212_173355-150x150.jpg"),
            Pair("Viral news: వామ్మో ఆమెంది సామీ అలా దూకేసింది..చీర కట్టులో..వీడియో వైరల్..", "https://telugunewsadda.com/wp-content/uploads/2023/02/IMG_20230211_180416-150x150.jpg"),

            )

        val listView = findViewById<ListView>(R.id.mainlist)
        val adapter = MyListAdapter(this, items)
        listView.adapter = adapter




//        val adapter = ArrayAdapter(this, R.layout.list_item, listItems)

    }
}
