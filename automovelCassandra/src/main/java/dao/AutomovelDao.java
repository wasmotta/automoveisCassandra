package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Automovel;
import conexao.Conexao;

public class AutomovelDao {

	public static boolean inserir(Automovel aux) {
		boolean res = false;
		Conexao con = Conexao.getInstance();
		// Curso curso = CursoDao.buscar(aux.getCurso().getIdCurso());
		try {
			String query = "INSERT INTO automovel(idautomovel,nome, velocidadeMax, cor) VALUES (?,?,?,?)";
			con.prepararComAI(query);

			con.getPstmt().setLong(1, aux.getIdCarro());
			con.getPstmt().setString(2, aux.getNome());
			con.getPstmt().setString(3, aux.getVelocidadeMax());
			con.getPstmt().setString(4, aux.getCor());
			res = con.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return (res);
		}
	}

	/*@SuppressWarnings("finally")
	public static boolean excluir(Disciplina aux) {
		boolean res = false;
		Conexao con = Conexao.getInstance();
		String query = "DELETE FROM discisplina WHERE iddiscisplina=?";
		con.preparar(query);
		try {
			con.getPstmt().setLong(1, aux.getIddisciplina());
			res = con.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return res;
		}
	}

	@SuppressWarnings("finally")
	public static boolean atualizar(Disciplina aux) {
		boolean res = false;
		Conexao con = Conexao.getInstance();
		String query = "UPDATE discisplina SET dcdisciplina=?,semestre=?,idcurso=? WHERE iddiscisplina=?";
		con.preparar(query);
		try {
			con.getPstmt().setString(1, aux.getDcDisciplina());
			con.getPstmt().setLong(2, aux.getSemestre());
			con.getPstmt().setLong(3, aux.getCurso().getIdCurso());
			con.getPstmt().setLong(4, aux.getIddisciplina());
			res = con.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return res;
		}
	}

	@SuppressWarnings("finally")
	public static Disciplina buscar(int idDisciplina) {
		Disciplina res = null;
		Conexao con = Conexao.getInstance();
		String query = "SELECT iddiscisplina, dcdisciplina, semestre, idcurso FROM discisplina WHERE iddiscisplina=?";
		con.preparar(query);
		try {
			con.getPstmt().setInt(1, idDisciplina);
			ResultSet rs = con.executeQuery();
			if (rs.next()) {
				res = new Disciplina();
				res.setIddisciplina(rs.getLong("iddiscisplina"));
				res.setDcDisciplina(rs.getString("dcdisciplina"));
				res.setDcDisciplina(rs.getString("semestre"));
				res.setCurso(CursoDao.buscar(rs.getInt("idcurso")));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return (res);
		}
	}

	public static void main(String[] args) {
		for (int i = 3; i < 9; i++) {

			 seleionar uma disciplina 
			
			 * System.out.println(DisciplinaDao.buscar(i).getIddisciplina());
			 

			 atualizar 
			
			 * Disciplina disciplina = new Disciplina();
			 * disciplina.setIddisciplina(i);
			 * disciplina.setDcDisciplina("atualizada");
			 * disciplina.setSemestre(1); disciplina.getCurso().setIdCurso(1);
			 * DisciplinaDao.atualizar(disciplina);
			 

			 excluir 

			
			 * Disciplina disciplina = new Disciplina();
			 * disciplina.setIddisciplina(i); DisciplinaDao.excluir(disciplina);
			 

			 inserir 

			
			 * Disciplina disciplina = new Disciplina();
			 * disciplina.setIddisciplina(i);
			 * disciplina.setDcDisciplina("Engenharia");
			 * disciplina.setSemestre(1); disciplina.getCurso().setIdCurso(1);
			 * DisciplinaDao.inserir(disciplina);
			 

		}
	}
*/
}
