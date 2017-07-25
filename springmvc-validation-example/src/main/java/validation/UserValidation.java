package validation;

import dto.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by cdn on 17/7/25.
 */
public class UserValidation implements Validator{


    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"username",null,"username is empty");
        User user = (User)o;
        if (user.getPassword() == null || "".equals(user.getPassword())){
            errors.rejectValue("password",null,"password is empty");
        }
    }
}
