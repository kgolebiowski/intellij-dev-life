import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/**
 * Created by kgolebiowski on 15.02.15.
 */
public class SampleMVCPortlet extends MVCPortlet {

    // TODO What is this?!
    int firstVar;
    int secondVar;
    int thirdVar;

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {

        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        User loggedUser = themeDisplay.getUser();
        Locale currentUserLocale = themeDisplay.getLocale();

        Group scopeGroup = themeDisplay.getScopeGroup();

        InputStream resourceAsStream = getClass().getResourceAsStream("");

        String translatedValue = LanguageUtil.get(currentUserLocale, "");

        System.out.println(loggedUser.getFullName());

        super.render(request, response);
    }
}
