package com.example.test.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.test.R;
import com.example.test.adapters.HadeethAdapter;
import com.example.test.adapters.HekamDeneyaAdapter;
import com.example.test.models.HekamDeneya;

import java.util.ArrayList;

public class HekamDeneyaActivity extends AppCompatActivity {
    private RecyclerView mRecyclerViewHekamDeneya;
    private RecyclerView.Adapter mAdapterHekamDeneya;
    private RecyclerView.LayoutManager mLayoutManagerHekamDeneya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hekam_deneya);
        ArrayList<HekamDeneya> hekamDeneyaArrayList = new ArrayList<>();
        hekamDeneyaArrayList.add(new HekamDeneya("في رمضان أغلق مدن أحقادك، واطرق أبواب الرحمة والمودة، فارحم القريب وود البعيد، وازرع المساحات البيضاء في حنايا روحك، وتخلّص من المساحات السوداء في داخلك، في رمضان صافح قلبك، ابتسم لذاتك، صالح نفسك، وأطلق أسر أحزانك، وعلّم همومك الطيران بعيداً عنك."));
        hekamDeneyaArrayList.add(new HekamDeneya("رحم الله امرءاً نظر ففكّر، وفكّر فاعتبر فأبصر، وأبصر فصبر، لقد أبصر أقوام ثم لم يصبروا، فذهب الجزع بقلوبهم، فلم يدركوا ما طلبوا، ولا رجعوا إلى ما فارقوا، فخسروا الدنيا والآخرة، وذلك هو الخسران المبين."));
        hekamDeneyaArrayList.add(new HekamDeneya("ادعُ الله بثبات، واستشعر اليقين في الإجابة منه سبحانه، وليعلمِ العبد أنّ اختيار الله عزّ وجلّ خير مِن اختياره لنفسه، هي كلمِات لم أحبذ أن أتوقف عند قراءتي لها، فقد تكون أنت في حاجتها؛ فبث في نفسك الأمِل والتفاؤل."));
        hekamDeneyaArrayList.add(new HekamDeneya("إننا نحن البشر نفكّر فيما لا نملك، ولا نشكر الله على ما نملك، وننظر إلى الجانب المأساوي المظلم في حياتنا، ولا ننظر إلى الجانب المشرق فكن إيجابياً."));
        hekamDeneyaArrayList.add(new HekamDeneya("أحياناً يغلق الله سبحانه وتعالى أمامنا باباً؛ لكي يفتح لنا باباً آخر أفضل منه، ولكن معظم الناس يضيّع تركيزه، ووقته، وطاقته في النظر إلى الباب الذي أغلق، بدلاً من باب الأمل الّذي انفتح أمامه على مصراعيه."));
        hekamDeneyaArrayList.add(new HekamDeneya("نحن لا نعلم من المرضيّ عند الله، ومن المغضوب عليه من مجرد الظاهرّ فقد يكون للمتدين ذنبٌ خفيّ أغضب الله، وقد يكون للعاصي حسنة خفيّة ترضي الله."));
        hekamDeneyaArrayList.add(new HekamDeneya("كلما وسّعت على النفس باتّباع الشهوات، وأرحت البدن، فقد ضيقت على حظ القلب من نور الله، وثقلت الروح، وهبطت، وكلّما ضيّقت على النفس؛ بترك الشهوات، وسّعت على القلب، حتّى ينشرح، ويرى نور الله وتسعد الروح، وتعلو."));
        hekamDeneyaArrayList.add(new HekamDeneya("تذكّر أولئك الذين كانوا ذات رمضان يملؤون عالمك، ثم غيّبتهم الأيام عنك ورحلوا كالأحلام، تاركين خلفهم البقايا الحزينة تملؤك بالحزن، كلما مررت بها أو مرّت ذات ذكرى بك."));
        hekamDeneyaArrayList.add(new HekamDeneya("وجدت حلاوة العبادة في أربعة أشياء: أولها في أداء فرائض الله، والثاني في اجتناب محارم الله، والثالث في الأمر بالمعروف ابتغاء ثواب الله، والرّابع في النهي عن المنكر اتقاء غضب الله."));
        hekamDeneyaArrayList.add(new HekamDeneya("إذاَ استقبلتَ العالَمَ بالنّفسِ الواسعةِ، رأيتَ حقائقَ السرورِ؛ تزيدُ، وتتسِعُ، وحقائقَ الهمومِ؛ تصغُرُ، وتَضيقُ، وأدركتَ أنَّ دنياكَ إن ضاقتْ؛ فأنتَ الضيِّقُ لا هيَ."));
        hekamDeneyaArrayList.add(new HekamDeneya("لا يكفي أن نؤمن بمحمد صلى الله عليه وسلم، ولا يكفي أن نُحبّه، ولا يكفي أن نحفظ أحاديثه صلى الله عليه وسلم، ولكن يجب أن يصبح كل واحد مِنّا محمد؛ أي يجب أن يجسّد كل واحد منّا محمد."));
        hekamDeneyaArrayList.add(new HekamDeneya("لا تحزن على ما في الحياة، فما خلقنا فيها إلا لنمتحن، ونبتلى حتى يرانا الله هل نصبر؟ لذلك هوّن عليك ولا تتكدّر وتأكّد بأنّ الفرج قريب فإذا اشتد سواد السحب، فعمّا قليل ستمطر."));
        hekamDeneyaArrayList.add(new HekamDeneya("اعلم إذا أصبح العبد وأمسى، وليس همه إلا الله وحده: تحمّل الله سبحانه حوائجه كلها، وحمل عنه كل ما أهمه، وفرّغ قلبه لمحبته، ولسانه لذكره، وجوراحه لخدمته وطاعته."));
        hekamDeneyaArrayList.add(new HekamDeneya("كان عمر رضي الله عنه، يقول لنفسه: والله لتتقينّ الله يا ابن الخطاب، أو ليعذبنّك، ثمّ لا يبالي بك، وكان يقول: من اتّقى الله لم يصنع كلّ ما تريده نفسه من الشهوات."));
        hekamDeneyaArrayList.add(new HekamDeneya("سأل عمر رضي الله عنه رجلاً عن شيء، فقال: الله أعلم، فقال عمر: لقد شقينا إن كنّا لا نعلم أنّ الله أعلم !! إذا سئل أحدكم عن شيء لا يعلمه، فليقل: لا أدري."));
        hekamDeneyaArrayList.add(new HekamDeneya("والله ما صدّق عبدٌ بالنار قط إلا ضاقت عليه الأرض بما رحبت، وإنّ المنافق لو كانت النّار خلف ظهره لم يصدّق بها، حتّى يهجم عليها."));
        hekamDeneyaArrayList.add(new HekamDeneya("النساء ثلاثة: هنية، عفيفة، مسلمة تعين أهلها على العيش، ولا تعين العيش على أهلها، وأخرى وعاء للولد، وثالثة غلّ يلقيه الله فى عنق من يشاء من عباده."));
        hekamDeneyaArrayList.add(new HekamDeneya("ما جلس قوم يذكرون الله عزّ وجل إلا حفَّتْهم الملائكةُ، وغشيتْهم الرحمة، ونزلتْ عليهم السكينة، وذكرهم اللهُ فيمن عنده. اللّهم اجعلنّا منهم يا رب."));
        hekamDeneyaArrayList.add(new HekamDeneya("إن ضاقت بك النفس عما بك، ومزّق الشك قلبك واستبدّ بك، وتلفّتَ فلم تجد بمن تثق، وغدا قلبك يحترق، وأصبح القريب منك غريب، وقلبه يحمل ثقلاً وصخراً رهيباً، ولفّك ليل، وحزن، ولهف، وأغلق الناس باب الودِّ وانصرفوا، فكنْ موقناً بأنّ هنالك باب يفيض رحمةً، ونوراً، وهدىً، ورحاباً، باب إليه قلوب الخلق تنطلق؛ فعند ربك باب لا ينغلق."));
        hekamDeneyaArrayList.add(new HekamDeneya("لا تزالُ هذه الأمة بخير، ولا تزال في كَنَفِ الله وستره، وتحت جناح ظلِّه ما لم يرفق خيارُهم بشرارهم، ويُعظِّم أبرارُهم فجَّارَهم، ويَمِلْ قرّاؤهم إلى أمرائهم، فإذا فعلوا ذلك، رفعت يد الله عنهم، وسُلِّط عليهم الجبابرة فساموهم سوء العذاب، ولعذابُ الآخرة أشقُّ وأبقى، وقذف في قلوبهم الرعب."));
        hekamDeneyaArrayList.add(new HekamDeneya("إذا سرت فلا تضيق على نفسك، ولا على أصحابك في مسيرك، ولا تغضب على قومك ولا على أصحابك، وإذا نصرتم على عدوكم فلا تقتلوا ولداً، ولا شيخاً، ولا إمرأة، ولا طفلاً، ولا تعقروا بهيمةً إلا للمأكول، ولا تغدروا إذا عاهدتم، ولا تنقضوا إذا صالحتم، وستمرّون على قوم في الصوامع رهباناً؛ فدعوهم ولا تهدموا صوامعهم."));
        hekamDeneyaArrayList.add(new HekamDeneya("كيف لا يبشّر العاقل بوقت يُغل فيه الشيطان؟ كيف لا يبشّر المؤمن بغلق أبواب النيران؟ كيف لا يبشّر المؤمن بفتح أبواب الجنان؟ اللهم اجعل التقوى لنا أربح بضاعة، ولا تجعلنا في هذا الشهر من أهل التفريط والإضاعة، وآمن خوفنا يوم تقوم السّاعة."));
        hekamDeneyaArrayList.add(new HekamDeneya("في رمضان أغلق مدن أحقادك، واطرق أبواب الرحمة والمودة، فارحم القريب وود البعيد، وازرع المساحات البيضاء في حنايا روحك، وتخلّص من المساحات السوداء في داخلك، في رمضان صافح قلبك، ابتسم لذاتك، صالح نفسك، وأطلق أسر أحزانك، وعلّم همومك الطيران بعيداً عنك."));


        mRecyclerViewHekamDeneya = findViewById(R.id.recyclerView_hekamDeneya);
        mRecyclerViewHekamDeneya.setHasFixedSize(true);
        mLayoutManagerHekamDeneya = new LinearLayoutManager(this);
        mAdapterHekamDeneya = new HekamDeneyaAdapter(hekamDeneyaArrayList);
        mRecyclerViewHekamDeneya.setLayoutManager(mLayoutManagerHekamDeneya);
        mRecyclerViewHekamDeneya.setAdapter(mAdapterHekamDeneya);

    }
}