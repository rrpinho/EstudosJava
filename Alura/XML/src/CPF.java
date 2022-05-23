public class CPF {
    
    public boolean ValidaCPF (String CPF)
    {

        switch(CPF.length())
        {
            case 11:
                if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
                CPF.equals("22222222222") || CPF.equals("33333333333") ||
                CPF.equals("44444444444") || CPF.equals("55555555555") ||
                CPF.equals("66666666666") || CPF.equals("77777777777") ||
                CPF.equals("88888888888") || CPF.equals("99999999999"))
                    return false;
                else
                {
                    
                }
                break;
            case 14:
                if ( CPF.equals("000.000.000-00") || CPF.equals("111.111.111-11") ||
                CPF.equals("222.222.222-22") || CPF.equals("333.333.333-33") ||
                CPF.equals("444.444.444-44") || CPF.equals("555.555.555-55") ||
                CPF.equals("666.666.666-66") || CPF.equals("777.777.777-77") ||
                CPF.equals("888.888.888-88") || CPF.equals("999.999.999-99"))
                    return false;
                else
                {

                }
                break;

        }
        return true;
    }
}
