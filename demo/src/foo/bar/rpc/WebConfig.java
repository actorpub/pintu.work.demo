package foo.bar.rpc;
/**
 * @author Silence
 * 这个接口带默认实现方法，要求jdk1.8
 * 这个接口是用来定制配置信息
 * 现在都这么搞了，嘿嘿
 * 目的是减少多人提交仓库的配置文件冲突（我猜的）
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@EnableWebMvc
public interface WebConfig extends WebMvcConfigurer {
	
	@Override
	public default void configureViewResolvers(ViewResolverRegistry registry) {
        registry.enableContentNegotiation(new MappingJackson2JsonView());
    }
}
