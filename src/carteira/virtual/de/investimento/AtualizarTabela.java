package carteira.virtual.de.investimento;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AtualizarTabela extends AbstractTableModel{

    ArrayList<Investimentos> linhas;    // Inicialização do ArrayList utilizado para armazenar os dados da tabela
    
    public AtualizarTabela(){
        linhas = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {  // Descobre quantas linhas a tabela possue
        return linhas.size();
    }

    @Override
    public int getColumnCount() {   // Descobre quantas colunas a tabela possue
       return 6;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {   // Puxa os valores de determinada linha/coluna
        if(coluna == 0){
            return linhas.get(linha).getNome();
        }else if(coluna == 1){
            return linhas.get(linha).getValorAporte();
        }else if(coluna == 2){
            return linhas.get(linha).getData();
        }else if(coluna == 3){
            return linhas.get(linha).getValorAtual();
        }else if(coluna == 4){
            return linhas.get(linha).getLucro();
        }else{
            return linhas.get(linha).getPorcentagem();
        }
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {  // Permite a edição na tabela
        if(coluna == 3){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public Class<?> getColumnClass(int coluna) {    // Descobre qual o tipo da váriavel puxada
        if(coluna==0 || coluna==2){
            return String.class;
        }else{
            return Double.class;
        }
    }
    
    @Override
    public void setValueAt(Object novoValor, int linha, int coluna) {   // Descobre as mudanças na tabela, e modifica seus valores
        double valorAtual = (double) novoValor;
        linhas.get(linha).setValorAtual(valorAtual);
        
        // Calcula os dados dos novos números da tabela
        double lucro = valorAtual - linhas.get(linha).getValorAporte();
        double porcentagem =((valorAtual * 100)/linhas.get(linha).getValorAporte()) - 100;
        
        linhas.get(linha).setLucro(lucro);
        linhas.get(linha).setPorcentagem(porcentagem);
        fireTableRowsUpdated(linha, linha); // Atualiza os valores da tabela
    }
    
    public void addNovaLinha(Investimentos investimento){   // Adiciona um novo dado a tabela
        System.out.println("Dados recebidos.");
        System.out.println("Prévia: " + investimento);
        linhas.add(investimento);   // Adiciona na tabela
        int puxarLinha = getRowCount(); // Puxa os dados de quantas linhas a tabela possue
        fireTableRowsInserted(puxarLinha, puxarLinha);  // Carrega os dados na tabela
    }
    
    
}
