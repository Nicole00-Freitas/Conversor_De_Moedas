<h1 align="left">💱 Conversor de Moedas em Java</h1>

###

<p align="left">💬 Seja bem-vindo(a) ao Conversor de Moedas!<br>Este é um projeto simples e funcional, ideal para reforçar conhecimentos em Java, consumo de API REST, tratamento de exceções, formatação de dados e organização de projetos em Java.<br>O programa foi desenvolvido como parte dos estudos da formação ONE - Oracle Next Education, em parceria com a Alura.</p>

###

<h2 align="left">🖼️ Demonstração</h2>

###

<p align="left">Veja o programa em funcionamento no terminal:</p>

###

<div align="center">
  <img height="255" src="https://i.imgflip.com/65efzo.gif"  />
</div>

###

<h2 align="left">🛠️ Funcionalidades</h2>

###

<p align="left">📝Exibe um menu com 6 opções de conversão:<br>      -🇺🇸 Dólar → Real / Real → Dólar<br>      - 🇺🇸 Dólar → Euro / Euro → Dólar<br>      - 🇺🇸 Dólar → Libra / Libra →Dólar<br><br>💬 Interação via console<br><br>🧮 Conversão em tempo real via ExchangeRate API<br><br>💲 Formatação do valor com símbolo da moeda correta<br><br>✅ Validações:<br>     - Opção do menu inválida<br>     - Valor negativo ou zero<br>     - Entrada que não seja número<br><br> 📊 Exibição de detalhes técnicos (como a taxa de conversão)</p>

###

<h2 align="left">🔧 Tecnologias utilizadas</h2>

###

<p align="left">- Java 23<br>- Biblioteca `java.net.http` (HttpClient, HttpRequest, HttpResponse)<br>- Biblioteca GSON para desserialização de JSON<br>- API pública ExchangeRate API<br>- IDE: IntelliJ IDEA (ou qualquer IDE compatível com Java)</p>

###

<div align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" height="40" alt="java logo"  />
  <img width="12" />
  <img src="https://skillicons.dev/icons?i=idea" height="40" alt="intellijidea logo"  />
</div>

###

<h2 align="left">🧩 Estrutura do Projeto</h2>

###

<p align="left">📁principal<br>└── Principal.java → Lógica principal e interação com o usuário. <br><br>📁calculo<br>└── ConversorDeMoedas.java → Requisição à API e cálculo da conversão.<br><br>📁modelo<br>└── RespostaConversaoMoeda.java → Record que modela o JSON da API.<br><br>📁util<br>└── FormatadorMoeda.java → Formata o valor com símbolo da moeda.<br><br>📁servico<br>└── ServicoAPI.java → Se desejar separar a lógica de requisição futuramente.</p>

###

<h2 align="left">🚀 Como executar o projeto</h2>

###

<p align="left">1. Clone este repositório em sua máquina: https://github.com/Nicole00-Freitas/Conversor_De_Moedas<br><br>2.Abra o projeto em sua IDE Java (como IntelliJ, Eclipse, VSCode...).<br><br>3.Certifique-se de estar usando o Java 21 ou superior.<br><br>4.Execute a classe Principal.java.<br><br>5.Siga as instruções do console! 😊</p>

###

<h2 align="left">💡 Futuras melhorias</h2>

###

<p align="left">✨ Este projeto pode crescer com novas funcionalidades, como:<br><br>🕓 Histórico de conversões realizadas<br><br>🌍 Aumento das moedas suportadas<br><br>🧾 Geração de registros de log para auditoria<br><br>💻 Interface gráfica (GUI) com JavaFX ou Swing<br><br>🌐 Detecção automática de moeda local<br><br>Se você quiser colaborar com alguma dessas ideias, fique à vontade! 🚀</p>

###

<h2 align="left">📚 Créditos e agradecimentos</h2>

###

<p align="left">Este projeto foi desenvolvido com base no desafio da formação ONE - Oracle Next Education em parceria com a Alura.<br>Um programa de capacitação e transformação de vidas através da tecnologia! 💙</p>

###

![Logo ONE](Logo_ONE.png)
![Logo Alura](Logo_Alura.jpeg)

###

<h2 align="left">📖 Licença de uso</h2>

###

<p align="left">Este projeto é de uso livre para fins de estudo, aprendizado e melhorias.<br>Sinta-se à vontade para explorar, modificar e contribuir! 🤝</p>

###

<h2 align="left">👩🏽‍💻 Desenvolvido por</h2>

###

<p align="left">Nicole Ribeiro</p>

###
