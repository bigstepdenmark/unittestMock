package exercise;

import exercise.realdatabase.UserFacadeRealDB;

/**
 * Created by ismailcam on 24/04/2017.
 */
public class UserFacadeTestIT extends UserFacadeTest
{

    @Override
    public IUserFacade makeUserFacade()
    {
        return new UserFacadeRealDB( "pu_localDB" );
    }
}
