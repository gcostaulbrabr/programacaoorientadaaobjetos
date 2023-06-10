public class MesHardcoded {
    // Lista gerada no PowerShell 7.3: ([cultureinfo]::GetCultureInfo("pt-BR").DateTimeFormat.MonthNames | % {if (-not [string]::IsNullOrEmpty($_)) { "`"$($_.Substring(0,1).ToUpper())$($_.Substring(1))`"" } } ) -join ',' | clip
    private final String[] mesesPorExtensoPtBr = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    // Lista gerada no PowerShell 7.3: ([cultureinfo]::GetCultureInfo("en-US").DateTimeFormat.MonthNames | % {if (-not [string]::IsNullOrEmpty($_)) { "`"$($_.Substring(0,1).ToUpper())$($_.Substring(1))`"" } } ) -join ',' | clip
    private final String[] mesesPorExtensoEnUs = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    private final String[][] mesesPorExtenso = {
            {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"},
            {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}
    };

    public String getMesPorExtenso(int mes, int codigoIdioma) {
        if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("Mês inválido! Deve estar no intervalo 1-12");

        if (codigoIdioma != 1 && codigoIdioma != 2)
            throw new IllegalArgumentException("Código de idioma inválido! Deve estar no intervalo 1-2");

        return mesesPorExtenso[codigoIdioma - 1][mes - 1];
    }
}
