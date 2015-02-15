import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

/**
 * Created by kgolebiowski on 15.02.15.
 */
public class SampleMVCPortlet extends MVCPortlet {

    @Override
    public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        super.render(request, response);
    }
}
