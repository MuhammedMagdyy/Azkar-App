package com.example.test.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.test.R;
import com.example.test.adapters.AhkamTajweedAdapter;
import com.example.test.adapters.AllDoaaAdapter;
import com.example.test.models.AhkamTajweed;

import java.util.ArrayList;

public class AhkamTajweedActivity extends AppCompatActivity {
    private RecyclerView mRecyclerViewAhkam;
    private RecyclerView.Adapter mAdapterAhkam;
    private RecyclerView.LayoutManager mLayoutManagerAhkam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahkam_tajweed);
        ArrayList<AhkamTajweed> tajweeds = new ArrayList<>();
        tajweeds.add(new AhkamTajweed("علم التجويد:\n" +
                "هو العلم الذي يُعنى بتلاوة القرآن الكريم تلاوةً صحيحة وذلك باتباع القواعد والأسس التي وضعها علماء التجويد، ويكون بإعطاء كلّ حرفٍ حقه وإخراجه من مخرجه السليم دون تشويهٍ أو تحريف، مع مراعاة اجتناب اللحن في نطق آيات القرآن الكريم، وتم وضع أسس علم التجويد بناءً على طريقة قراءة رسول الله -صلى الله عليه وسلم- للقرآن الكريم وكما أوحى الله له بها، وسيتطرق هذا المقال إلى ذكر أحكام التجويد كاملة."));
        tajweeds.add(new AhkamTajweed("مخارج الحروف:\n" +
                "يُقصد بمخارج الحروف المكان الذي يخرج منه صوت الحرف الهجائي عند نطقه، وقد قسم أهل العلم حروف الهجاء بحسب مخارجها إلى خمسة مخارج وهي على النحو الآتي:\n" +
                "الجوف:\n" +
                "وهو المكان الواقع داخل الفم والحلق، ويخرج منه ثلاثة حروف وهي: \"الالف والواو والياء\".\n" +
                "الحلق:\n" +
                "وهو منطقة الحنجرة ويخرج منها ستة حروف وهي: \"الهمزة والهاء والحاء والخاء والعين والغين\".\n" +
                "الشفتان:\n" +
                "ويخرج منها أربعة حروف وهي: \"الباء والفاء والميم والواو\".\n" +
                "الخيشوم:\n" +
                "هو أقصى الأنف الأقرب إلى الفم، ويخرج منه مخرجٌ واحدٌ وهو الغنّة.\n" +
                "اللسان:\n" +
                "ويخرج منه ثمانية عشر حرفًا هي باقي حروف الهجاء."));
        tajweeds.add(new AhkamTajweed("أحكام التجويد:\n" +
                "تختلف أحكام التجويد باختلاف الحروف ومكان توضعها في الكلمة، لذا قسّم علماء التجويد هذه الأحكام ليسهل على القارئ تعلمها وفهمها، بحيث يخرج كلّ حرفٍ من مخرجه الصحيح بنطقٍ سليم، ويجدر بالذكر على أنّ كلمة \"حركة\" ستتكرر في شرح أحكام التجويد، والحركة في علم التجويد هي الزمن اللازم لنطق الحرف والتي تكون بمقدار الزمن اللازم لثني الإصبع ومدّه، وأحكام التجويد كاملةً هي على النحو الآتي:\n" +
                "أحكام النون الساكنة والتنوين:\n" +
                "يختلف حكم نطق النون الساكنة أو التنوين باختلاف الحرف الذي يليها، وإنّ لها مع التقائها بحروف الهجاء أربعة أحوالٍ وهي:\n" +
                "- الإدغام:\n" +
                "والذي يكون باندماج النون الساكنة أو التنوين بالحرف الذي يليها، ويقسم بدوره إلى قسمين: إدغامٌ بغنة -والغنة هي إخراج صوت الحرف من الأنف- ويكون بمجيء النون الساكنة أو التنوين وبعدها حرفٌ من حروف الإدغام بغنة وهي: \"الياء، والنون، والميم، والواو\" ويكون مقدارها حركتين ومثاله \"وَمَنْ يَعْمَلْ\"، \"أَعْنَابٍ وَزَرْعٌ\"، والقسم الثاني هو إدغامٌ بلا غنة ويكون بمجيء النون الساكنة أو التنوين وبعدها إمّا \"الراء أو اللام\" ومثاله: \"مِنْ لَدُنْهُ\"، \"تَوَّابًا رَحِيمًا\".\n" +
                "- الإظهار: \n" +
                "ويكون بإظهار نطق النون الساكنة أو التنوين والحرف الذي يليها إذا كان من الحروف الآتية: \"الهمزة، والهاء، والعين، والحاء، والغين، والخاء\" ويكون بلا غنة ومثاله: \"مِنْ هَادٍ\"، \"مَنْ عَمِلَ\". \n" +
                "- الإقلاب:\n" +
                "ويكون بقلب لفظ النون الساكنة أو التنوين إلى ميم إذا جاء بعدها حرف \"الباء\"، ويكون لفظها كأنّها ميمٌ مشددة مع غنة ومثاله: \"مِنْ بَعْدِ\".\n" +
                "- الإخفاء: \n" +
                "وهو إخفاء نطق النون الساكنة أو التنوين وإظهار نطق الحرف الذي يليها بوجود الغنة، وحروف الهجاء خمسة عشر وهي باقي الحروف الهجائية \"التاء، والثاء، والجيم، والدال، والذال، والزاي، والسين، والشين، والصاد، والضاد، والطاء، والظاء، والفاء، والقاف، والكاف\"، ومثاله: \"ريحٍ صرصرٍ\"، \"مَنْ ذَا\"."));
        tajweeds.add(new AhkamTajweed("أحكام الميم الساكنة: للميم الساكنة في علم التجويد ثلاث حالات وهي:\n" +
                "- الإخفاء الشفوي: \n" +
                "ويكون بمجيء الميم الساكنة وبعدها حرف \"الباء\" ويكون بإخفاء نطق الميم الساكنة وبقاء الغنة بمقدار حركتين، ومثاله: \"وهمْ بالآخرة\". \n" +
                "- الإدغام الشفوي: \n" +
                "ويكون بدمج الميم الساكنة بالحرف الذي يليها إذا كان هذا الحرف ميمًا متحركة وتلفظ كأنّها ميمٌ مشددة بغنة مقدارها حركتان، ومثاله: \"جاءكمْ مِن\". \n" +
                "- الإظهار الشفوي: \n" +
                "وهو إظهار نطق الميم الساكنة والحرف الذي يليها دون غنة إذا كان هذا الحرف أحد حروف الهجاء عدا \"الباء والميم\"، ومثاله: \"ذلكمْ خير\"، \"ولكمْ فيها\"."));
        tajweeds.add(new AhkamTajweed("أحكام المدود:\n" +
                "ويكون بإطالة نطق أحد حرف المدّ ما مقداره حركتان أو أكثر بحسب نوع المد، وحروف المدّ هي: الألف الساكنة المفتوح ما قبلها، والواو الساكنة المضموم ما قبلها، والياء الساكنة المكسور ما قبلها، وتقسم المدود إلى:\n" +
                "- المد الطبيعي.\n" +
                "- المد المتصل. \n" +
                "- المد المنفصل. \n" +
                "- المد العارض للسكون. \n" +
                "- مد البدل. \n" +
                "- المدّ اللازم."));
        tajweeds.add(new AhkamTajweed("مد الحركات يمكن للحركات أيضًا أن تمدّ فيكون لفظ الضمة واوًا والكسرة ياءً والفتحة ألفًا، والذي يقسم بدوره إلى:\n" +
                "- مد الصلة الصغرى. \n" +
                "- مد الصلة الكبرى. \n" +
                "- مد العوض. \n" +
                "- مد التمكين. \n" +
                "- مد اللين. \n" +
                "- مد الفرق."));
        tajweeds.add(new AhkamTajweed("التفخيم والترقيق: \n" +
                "ويكون بتضخيم الصوت عند نطق الحرف أو ترقيقه، وتنقسم حروف الهجاء إلى ثلاثة أقسام من حيث التفخيم والترقيق وهي كما يأتي:\n" +
                "- المُفخم دائمًا:\n" +
                "وهي ستة حروف \"الخاء والصاد والضاد والطاء والظاء والغين والقاف\". \n" +
                "- المُرقق دائمًا: \n" +
                "وهي كلّ حروف الهجاء باستثناء حروف التفخيم وباستثناء\" الالف والراء واللام\" أيضًا. \n" +
                "- المتأرجح بين التفخيم والترقيق: \n" +
                "وهي \"اللام والألف والراء\" إذ أنّها تفخم وترقق بحسب الحرف الذي يسبقها وحركته."));
        tajweeds.add(new AhkamTajweed("تلك كانت أحكام التجويد كاملةً ويجب التنويه إلى الالتزام بقواعد لفظ اللام الشمسية والقمرية، وكذلك همزات الوصل والقطع ومراعاة الوقف والابتداء حتى تكتمل صورة القراءة الصحيحة للقرآن الكريم."));


        mRecyclerViewAhkam = findViewById(R.id.recyclerView_ahkam_tajweed);
        mRecyclerViewAhkam.setHasFixedSize(true);
        mLayoutManagerAhkam = new LinearLayoutManager(this);
        mAdapterAhkam = new AhkamTajweedAdapter(tajweeds);
        mRecyclerViewAhkam.setLayoutManager(mLayoutManagerAhkam);
        mRecyclerViewAhkam.setAdapter(mAdapterAhkam);

    }
}