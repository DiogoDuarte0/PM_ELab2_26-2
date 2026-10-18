/** 
 * MIT License
 *
 * Copyright(c) 2026 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * @author João Caram - caram@pucminas.br
 * Utilização do Copilot para geração de documentação da classes.  
 */

/**
 * Representa um funcionário da empresa.
 * <p>
 * Esta é a classe base abstrata para os diferentes tipos de funcionário do sistema,
 * como {@link Analista} e {@link Gerente}. Ela concentra os dados comuns de identificação
 * e o comportamento esperado de pagamento.
 * </p>
 */
public abstract class Funcionario {

	private String nome;
	private String CPF;
	protected double ultimoSalario;

	/**
	 * Cria um novo funcionário com nome e CPF informados.
	 *
	 * @param nome nome do funcionário
	 * @param CPF documento de identificação do funcionário
	 */
	protected Funcionario(String nome, String CPF) {
		this.CPF = CPF;
		this.nome = nome;
	}

	/**
	 * Registra o pagamento do funcionário e atualiza o valor do último salário recebido.
	 *
	 * @return valor do pagamento registrado
	 */
	public abstract double registrarPagamento();

	/**
	 * Compara este funcionário com outro objeto com base no CPF.
	 *
	 * @param obj objeto a ser comparado
	 * @return {@code true} se o outro objeto for um funcionário com o mesmo CPF;
	 *         {@code false} caso contrário
	 */
	@Override 
	public boolean equals(Object obj) {
		Funcionario outro = (Funcionario)obj;
		return  CPF.equals(outro.CPF);
	}

	/**
	 * Retorna o código hash baseado no CPF.
	 *
	 * @return código hash do CPF
	 */
	@Override 
	public int hashCode() {
		return  CPF.hashCode();
	}

	/**
	 * Retorna uma representação textual do funcionário, incluindo nome, CPF
	 * e o último salário recebido.
	 *
	 * @return descrição textual do funcionário
	 */
	@Override 
	public String toString() {
		return String.format("%s (%s) - Último salário recebido: R$ %.2f", nome, CPF, ultimoSalario);
	}
}