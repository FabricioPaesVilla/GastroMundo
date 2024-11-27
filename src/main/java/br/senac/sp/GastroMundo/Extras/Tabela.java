/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.sp.GastroMundo.Extras;

import br.senac.sp.GastroMundo.modelo.ModeloCarrinho;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Casa
 */
public class Tabela extends AbstractTableModel {

    private List<ModeloCarrinho> lista;
    private String[] cabecalho = {"id", "prato", "qtd", "valor"};
    private int x=0, y=0,xc=0,yc=0;

    public Tabela(List<ModeloCarrinho> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }
    
    @Override
    public int getColumnCount() {
        return cabecalho.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModeloCarrinho m = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return m.getId();
            case 1:
                return m.getPrato();
            case 2:
                return m.getQtd();
            case 3:
                return m.getValor();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return cabecalho[column];
    }
    /*
    @Override
    public String toString() {
        //return super.toString(); 
        /*
        switch () {
		case 0:
			return ;
		case 1:
			return ;
		default:
			return null;
		}
        if(x<4&&y<4){
            
        }
        
        return "teste";
    }
    */
    

}
