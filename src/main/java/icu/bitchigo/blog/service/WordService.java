package icu.bitchigo.blog.service;

import icu.bitchigo.blog.mapper.ClassifyMapper;
import icu.bitchigo.blog.mapper.TagMapper;
import icu.bitchigo.blog.mapper.WordMapper;
import icu.bitchigo.blog.pojo.po.Word;
import icu.bitchigo.blog.pojo.vo.WordView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class WordService {
    @Autowired
    private ClassifyMapper classifyMapper;
    @Autowired
    private TagMapper tagMapper;
    @Autowired
    private WordMapper wordMapper;
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    public WordView getWord(int id){
        Word word = wordMapper.selectById(id);
        WordView wordView = new WordView();
        wordView.setId(word.getId());
        wordView.setCreatTime(
                simpleDateFormat.format(word.getCreateTime())
        );
        wordView.setUpdateTime(
                simpleDateFormat.format(word.getUpdateTime())
        );
        wordView.setText(word.getText());
        wordView.setTitle(word.getTitle());
        wordView.setTag(tagMapper.getTags(word.getId()));
        wordView.setClassify(classifyMapper.selectById(word.getClassify()));
        return wordView;
    }
}
