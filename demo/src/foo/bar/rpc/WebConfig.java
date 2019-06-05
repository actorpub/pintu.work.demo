package foo.bar.rpc;
/**
 * @author Silence
 * ����ӿڴ�Ĭ��ʵ�ַ�����Ҫ��jdk1.8
 * ����ӿ�����������������Ϣ
 * ���ڶ���ô���ˣ��ٺ�
 * Ŀ���Ǽ��ٶ����ύ�ֿ�������ļ���ͻ���Ҳµģ�
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
