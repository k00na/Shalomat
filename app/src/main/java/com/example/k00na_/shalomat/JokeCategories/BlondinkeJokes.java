package com.example.k00na_.shalomat.JokeCategories;

import com.example.k00na_.shalomat.Model.Joke;

import java.util.ArrayList;

/**
 * Created by k00na_ on 26.8.2015.
 */
public class BlondinkeJokes {

    private static String[] blondinke = {"V neki vasi imajo tekmovanje kera ima najlepšo. Pa pride na oder črnolaska, pa vsi:\"Jeeeee...\". Pa pride na oder rjavolaska, pa spet vsi:\"Jeeeee...\". Pa pride na oder blondinka, pa vse tiho in odide blondinka žalostna z odra. Naslednji dan dobi pismo, v katerem piše:\"Zmaga je vaša, aplavza vam nismo dali, ker smo se za kurca držali.\"",
    "Blondinki sta gledali televizijski prenos atletskega tekmovanja. Videli sta kako je eden od tekačev z lahkoto in zelo hitro preskakoval ovire. Nato so prizor pokazali še v počasnem posnetku in ena od blondink je rekla:\n" +
            "\"Še malo prej je bil tako hiter, zdaj mu je pa zmanjkalo kondicije!\"",
    "Zakaj prijatelj blondinki ne pove več, kadar gre streljati glinaste golobe?\n" +
            "\"Ker mu je zadnjič rekla, da je brez zveze streljati te mrcine, ker nima recepta, da bi jih potem pripravila za kosilo.\"",
    "Zakaj se je blondinka zadušila z mlekom?\n" +
            "\"Ker je nanjo padla krava.\"",
    "Dve blondinki sta na bazenu našli dve bombi.Prva blondinka reče:\"\"Nesiva bombi na policijo.\"\"Druga reče:\"Strinjam se, ampak pomisli: kaj če nama ena bomba med potjo eksplodira??\"\"Prva reče:\"Bova pa rekli, da sva našli samo eno.\"",
    "Znani osvajalec ženskih src je k sebi domov na večerjo povabil blondinko. Ko sta sedla za mizo je blondinka jedla, jedla, jedla.... Začudeni mladenič jo je končno vprašal:\"Če bi vas na večerjo povabil kakšen drug moški, ali bi tudi toliko jedla?\"\"Ne, drugi mi ponavadi najprej ponudijo sladico!\"",
    "V prodajalni z avdio in video tehniko se je oglasila blondinka in se pritožila prodajalcu:\n" +
            "\"Včeraj sem pri vas kupila radio in vi ste mi rekli, da bom z njim lahko poslušala vse radijske postaje!\"\n" +
            "\"Jih ne morete?\" se je začudil prodajalec.\n" +
            "\"Lahko, ampak eno po eno ne pa vseh skupaj!\"",
    "Blondinka se je preselila v hišo, ki je stala poleg železniške proge. Vsako jutro je skozi okno opazovala moškega, oblečenega v uniformo, ki je hodil po tirih in pregledoval tračnice. Nekoč se je odločila, da bo odšla na sprehod po tračnicah. Nekaj časa je hodila po tračnicah, nato pa ji je nasproti pripeljal vlak. Strojevodja je začel dajati opozorilne znake, toda blondinka se ni umaknila in vlak jo je zbil. Blondinka je obležala v jarku poleg proge. Odpeljali so jo v bolnišnico, kjer se je šele čez dva meseca prebudila iz kome. Ko se ji je stanje izboljšalo, so jo vprašali, zakaj se ni umaknila vlaku.\n" +
            "\"Kje ste pa še videli, da bi vlak vozil po sprehajalni stezi?\" je odgovorila blondinka.",
            "Bosanec, član cirkusa, ki je gostoval v Ljubljani, je hodil po mestu, na ramenih pa je nosil opico. Ljudje so ga zvedavo pogledovali. Ko je prišel do veleblagovnice je v izložbi videl stvar, ki si jo je želel kupiti, toda z opico ni smel vstopiti v trgovino. Mimo je prišla blondinka in Bosanec jo je zaprosil, naj mu jo malo pridrži, ta čas pa bo on skočil v trgovino. Rečeno - storjeno. Blondinka je stala pred trgovino in v naročju držala opico. Mimo je prišla blondinkina prijateljica, seveda tudi blondinka, in jo vprašala:\n" +
                    "\"Kaj pa imaš v naročju?\"\n" +
                    "\"Opico od Bosanca.\"\n" +
                    "\"Zakaj pa nisi splavila?\" se je začudila prijateljica.",
            "\n" +
                    "Blondinka se je učila igrati golf, pa je s svojimi nemogočimi prijemi in obnašanjem na igrišču popolnoma iznervirala svojega trenerja. Njegovi nasveti niso nič pomagali, zato se je odločil za zvijačo in ji rekel:\n" +
                    "\"Zamisli si, da je tale palica penis tvojega moža in udari, tako kot je treba!\"\n" +
                    "Blondinka ga je poslušala in udarila žogico, ki je letela daleč, daleč...\n" +
                    "\"No, vidiš, tako se dela!\" jo je pohvalil trener. \"In zdaj \n" +
                    "daš lahko palico iz ust!\"",
            "\n" +
                    "Kaj je blondinka na vodni postelji?\n" +
                    "\"Vrtalna ploščad.\""
    };

    public static ArrayList<Joke> getBlondinkeJokes(){

        ArrayList<Joke> blondinkeJokes = new ArrayList<Joke>();


        for(int i = 0; i<blondinke.length; i++){
            Joke joke = new Joke();
            joke.setJokeContent(blondinke[i]);
            blondinkeJokes.add(joke);
        }

        return blondinkeJokes;
    }

}
