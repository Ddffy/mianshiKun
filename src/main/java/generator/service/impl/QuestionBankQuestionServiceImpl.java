package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.QuestionBankQuestion;
import generator.service.QuestionBankQuestionService;
import generator.mapper.QuestionBankQuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author lcm
* @description 针对表【question_bank_question(题库题目)】的数据库操作Service实现
* @createDate 2025-01-15 15:53:01
*/
@Service
public class QuestionBankQuestionServiceImpl extends ServiceImpl<QuestionBankQuestionMapper, QuestionBankQuestion>
    implements QuestionBankQuestionService{

}




