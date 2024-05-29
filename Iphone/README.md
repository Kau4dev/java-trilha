[![](https://mermaid.ink/img/pako:eNq9U0FuwjAQ_ErkE1XhAzlUQu2lh1aoVD35ssRLsqqzG21s1IL4ew0JiBCObX2xvR7NjMfenSnEoclN4aFtnwhKhdqy5SyNYy17w0bFxSD6ElsqwGe77vgw7oMUoJO7i0oDsb0qteixIGHoKSbLoMRlVh93F8hutR8amDeg6Ct5TyxrYSpk4MBTmeR6Ro41qlxqQ0B2OPRDiYRAH0UVST5kezq9Un6FDZbgRJ85oDKGgTB-0Yp0ASXx-UZR_UDcUXfvV9nAfAWTobMInrZworjtgRaVMP5h5r8a4L8E00cymz3c-JwjyPj7jCCjd-4Qls3UpDhqIJda5PgE1oQKa7QmT0sH-mmN5X3CQTKx_ObC5EEjTo1KLCuTr8G3aRcbl3Ls--tcRUcH530HHqb9DwuBHVQ?type=png)](https://mermaid.live/edit#pako:eNq9U0FuwjAQ_ErkE1XhAzlUQu2lh1aoVD35ssRLsqqzG21s1IL4ew0JiBCObX2xvR7NjMfenSnEoclN4aFtnwhKhdqy5SyNYy17w0bFxSD6ElsqwGe77vgw7oMUoJO7i0oDsb0qteixIGHoKSbLoMRlVh93F8hutR8amDeg6Ct5TyxrYSpk4MBTmeR6Ro41qlxqQ0B2OPRDiYRAH0UVST5kezq9Un6FDZbgRJ85oDKGgTB-0Yp0ASXx-UZR_UDcUXfvV9nAfAWTobMInrZworjtgRaVMP5h5r8a4L8E00cymz3c-JwjyPj7jCCjd-4Qls3UpDhqIJda5PgE1oQKa7QmT0sH-mmN5X3CQTKx_ObC5EEjTo1KLCuTr8G3aRcbl3Ls--tcRUcH530HHqb9DwuBHVQ)
classDiagram

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical 
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
    
