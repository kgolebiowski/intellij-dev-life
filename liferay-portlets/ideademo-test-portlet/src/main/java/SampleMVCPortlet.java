import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

/**
 * Created by kgolebiowski on 15.02.15.
 */
public class SampleMVCPortlet extends MVCPortlet {

    int firstVar;
    int secondVar;
    int thirdVar;

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {

        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        User loggedUser = themeDisplay.getUser();

        Group scopeGroup = themeDisplay.getScopeGroup();

        getClass().getResourceAsStream("/rebel.xml");

        firstVar = 1;
        secondVar = 2;

        thirdVar = firstVar + secondVar;

        System.out.println(loggedUser.getFullName());

        super.render(request, response);
    }
}
