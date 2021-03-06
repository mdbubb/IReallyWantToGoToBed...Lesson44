import java.util.Comparator;

/**
 * Created by mdb17 on 2/15/2017.
 */
public class Compare implements Comparator
    {
        public int compare(Object firstObject, Object secondObject)
        {
            bankAccount ba1 = (bankAccount) firstObject;
            bankAccount ba2 = (bankAccount) secondObject;

            int retValue;
            if (ba1.balance < ba2.balance)
            {
                retValue = -1;
            }
            else
            {
                if (ba1.balance > ba2.balance)
                {
                    retValue = 1;
                }
                else
                {
                    retValue = 0;
                }
            }
            return retValue;
        }
}
