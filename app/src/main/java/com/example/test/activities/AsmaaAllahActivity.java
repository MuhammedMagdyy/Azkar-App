package com.example.test.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.test.R;
import com.example.test.adapters.AllDoaaAdapter;
import com.example.test.adapters.AsmaaAllahAdapter;
import com.example.test.models.AsmaaAllah;

import java.util.ArrayList;

public class AsmaaAllahActivity extends AppCompatActivity {
    private RecyclerView mRecyclerViewAsmaaAllah;
    private RecyclerView.Adapter mAdapterAsmaaAllah;
    private RecyclerView.LayoutManager mLayoutManagerAsmaaAllah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaa_allah);
        ArrayList<AsmaaAllah> asmaaAllahArrayList = new ArrayList<>();

        asmaaAllahArrayList.add(new AsmaaAllah("الأسماء الحسنى في القرآن\n" +
                "\n" +
                "قال تعالى : \"وَلِلّهِ الأَسْمَاء الْحُسْنَى فَادْعُوهُ بِهَا وَذَرُواْ الَّذِينَ يُلْحِدُونَ فِي أَسْمَآئِهِ سَيُجْزَوْنَ مَا كَانُواْ يَعْمَلُونَ\". [الأعراف - 180]\n" +
                "وقال تعالى : \"قُلِ ادْعُوا اللَّهَ أَوِ ادْعُوا الرَّحْمَنَ أَيًّا مَا تَدْعُوا فَلَهُ الْأَسْمَاءُ الْحُسْنَى وَلَا تَجْهَرْ بِصَلَاتِكَ وَلَا تُخَافِتْ بِهَا وَابْتَغِ بَيْنَ ذَلِكَ سَبِيلًا\". [الإسراء - 110]\n" +
                "وقال تعالى : \"اللَّهُ لَا إِلَهَ إِلَّا هُوَ لَهُ الْأَسْمَاءُ الْحُسْنَى\". [طه - 8]\n" +
                "وقال تعالى : \"هُوَ اللَّهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ لَهُ الْأَسْمَاءُ الْحُسْنَى يُسَبِّحُ لَهُ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ وَهُوَ الْعَزِيزُ الْحَكِيمُ\". [الحشر - 24]\n" +
                "الأسماء الحسنى في الحديث\n" +
                "\n" +
                "قَالَ رَسُولَ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ : \"إِنَّ لِلَّهِ تِسْعَةً وَتِسْعِينَ اسْمًا مِائَةً إِلا وَاحِدًا مَنْ أَحْصَاهَا دَخَلَ الْجَنَّةَ\"."));
        asmaaAllahArrayList.add(new AsmaaAllah("أسماء الله الحسنى هي وصف لله عز وجل يستخدمها المسلم لدعاء ربه وتدل على توحيده بالله، ولكل اسم من أسماء الله الحسنى معنى ومكان للاستخدام في الدعاء."));
        asmaaAllahArrayList.add(new AsmaaAllah("أسماء الله الحسنى:\nالله - الرحمن - الرحيم - الملك - القدوس\nالسلام - المؤمن - المهيمن - العزيز - الجبار\nالمتكبر - الخالق - البارئ - المصور - الغفار\nالقهار - الوهاب -الرزاق -الفتاح -العليم\nالقابض -الباسط -الخافض -الرافع -المعز\nالمذل - السميع -البصير - الحكم - العدل\nاللطيف - الخبير - الحليم - العظيم - الغفور\nالشكور - العلي - الكبير - الحفيظ - المقيت\nالحسيب - الجليل - الكريم - الرقيب - المجيب\nالواسع - الحكيم - الودود - المجيد - الباعث\nالشهيد - الحق - الوكيل - القوي - المتين\nالولي - الحميد - المحصي - المبدئ - المعيد\nالمحيي - المميت - الحي - القيوم - الواجد\nالماجد - الواحد - الأحد - الصمد - القادر\nالمقتدر - المقدم - المؤخر - الأول - الآخر\nالظاهر - الباطن - الوالي - المتعالي - البر\nالتواب - المنتقم - العفو - الرءوف - مالك الملك\nذو الجلال والإكرام - المقسط - الجامع - الغني\nالمغني - المانع - الضار - النافع - النور - الهادي\nالبديع - الباقي - الوارث - الرشيد - الصبور."));


        mRecyclerViewAsmaaAllah = findViewById(R.id.recyclerView_asmaa_allah);
        mRecyclerViewAsmaaAllah.setHasFixedSize(true);
        mLayoutManagerAsmaaAllah = new LinearLayoutManager(this);
        mAdapterAsmaaAllah = new AsmaaAllahAdapter(asmaaAllahArrayList);
        mRecyclerViewAsmaaAllah.setLayoutManager(mLayoutManagerAsmaaAllah);
        mRecyclerViewAsmaaAllah.setAdapter(mAdapterAsmaaAllah);
    }
}