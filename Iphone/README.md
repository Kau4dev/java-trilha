![image](https://github.com/Kau4dev/java-trilha/assets/162048246/6cfe4074-ed62-477a-a2db-5e2091632345)

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
    
