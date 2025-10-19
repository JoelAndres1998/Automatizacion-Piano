public class Escenarios {

    public static void secuencia1(PianoPage piano) throws InterruptedException {
        String escenario = "Escenario 1";
        piano.tocarSi(escenario);
        piano.tocarSi(escenario);
        piano.tocarDo(escenario);
        piano.tocarRe(escenario);
        piano.tocarRe(escenario);
        piano.tocarDo(escenario);
        piano.tocarSi(escenario);
        piano.tocarLa(escenario);
        piano.tocarSol(escenario);
        piano.tocarSol(escenario);
        piano.tocarLa(escenario);
        piano.tocarSi(escenario);
        piano.tocarSi(escenario);
        piano.tocarLa(escenario);
    }

    public static void secuencia2(PianoPage piano) throws InterruptedException {
        String escenario = "Escenario 2";
        for (int i = 0; i < 2; i++) {
            TestReport.resultadoPaso(escenario, "Repetición " + (i + 1), true, "Inicio de repetición");
            piano.tocarSi(escenario);
            piano.tocarSi(escenario);
            piano.tocarDo(escenario);
            piano.tocarRe(escenario);
            piano.tocarRe(escenario);
            piano.tocarDo(escenario);
            piano.tocarSi(escenario);
            piano.tocarLa(escenario);
            piano.tocarSol(escenario);
            piano.tocarSol(escenario);
            piano.tocarLa(escenario);
            piano.tocarSi(escenario);
            piano.tocarSi(escenario);
            piano.tocarLa(escenario);
        }
    }


    public static void secuencia3(PianoPage piano) throws InterruptedException {
        String escenario = "Escenario 3";
        piano.tocarSi(escenario);
        piano.tocarSi(escenario);
        piano.tocarDo(escenario);
        piano.tocarRe(escenario);
        piano.tocarRe(escenario);
        piano.tocarDo(escenario);
        piano.tocarSi(escenario);
        piano.tocarLa(escenario);
        piano.tocarSol(escenario);
        piano.tocarSol(escenario);
        piano.tocarLa(escenario);
        piano.tocarSi(escenario);
        piano.tocarLa(escenario);
        piano.tocarSol(escenario);
        piano.tocarSol(escenario);
        piano.tocarLa(escenario);
        piano.tocarSi(escenario);
        piano.tocarSol(escenario);
        piano.tocarLa(escenario);
        piano.tocarSi(escenario);
        piano.tocarDo(escenario);
        piano.tocarSi(escenario);
        piano.tocarSol(escenario);
        piano.tocarLa(escenario);
        piano.tocarSi(escenario);
        piano.tocarDo(escenario);
        piano.tocarSi(escenario);
        piano.tocarSol(escenario);
        piano.tocarSol(escenario);
        piano.tocarFa(escenario);
        piano.tocarRe(escenario);
    }
}
