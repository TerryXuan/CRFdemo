package Hanlp;
import java.io.IOException;
import java.text.ParseException;
import com.hankcs.hanlp.*;
import com.hankcs.hanlp.model.crf.CRFLexicalAnalyzer;
import com.hankcs.hanlp.seg.CRF.CRFSegment;
/** 
* @Description: hanlp实现CRF的NER
* @Param:
* @return:
* @Author: 蔡如昕 TerryCai
* @Date: 2020/2/28
*/

public class HanlpDemo {
    public static void main(String[] args) throws ParseException, IOException {
        System.out.println(HanLP.segment("你好，欢迎使用HanLP汉语处理包！"));
        CRFLexicalAnalyzer analyzer = new CRFLexicalAnalyzer();
        CRFSegment segment = new CRFSegment();
        segment.enablePartOfSpeechTagging(true);
        System.out.println(segment.seg("你看过穆赫兰道吗"));
        String[] tests = new String[]{
                "商品和服务",
                "上海华安工业（集团）公司董事长谭旭光和秘书胡花蕊来到美国纽约现代艺术博物馆参观",
                "微软公司於1975年由比爾·蓋茲和保羅·艾倫創立，18年啟動以智慧雲端、前端為導向的大改組。"
        };
        for (String sentence : tests)
        {
            System.out.println(analyzer.analyze(sentence));
        }
    }
}
