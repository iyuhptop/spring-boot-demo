package top.buzhui.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author hexiao
 * Created At 2021/8/12
 */
@RestController
@RequestMapping
public class HelloController {

    private static List<String> poetry = new ArrayList<>();
    private static Random random = new Random(System.currentTimeMillis());

    static {
        poetry.add("醉里不知天在水  满船清梦压星河");
        poetry.add("弃我去者，昨日之日不可留  乱我心者，今日之日多烦忧");
        poetry.add("北国风光，千里冰封，万里雪飘。望长城内外，惟余莽莽；大河上下，顿失滔滔");
    }

    @RequestMapping("/hello")
    public Object hello() {
        return poetry.get(random.nextInt(3));
    }

    @RequestMapping("/_health")
    public Object health() {
        return "PONG";
    }
}
