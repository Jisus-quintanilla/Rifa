using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Rifa1.Clases
{
    internal class Rifa2
    {
        public int Aleatorio(int n1, int n2)
        {
            Random ran = new Random();
            return ran.Next(n1 - 1, n2 - 1);
        }

        public int Aleatorionum1(int nu1, int nu2)
        {
            Random ran = new Random();
            return ran.Next(nu1,nu2);
        }
        public void Sorteo(string[] Candidatos, int Premios)
        {
            int tombola;
            int Money;

            int Candidatos1, Candidatos2;
            Candidatos2 = -1;

                    Money = Aleatorionum1(300,400);
                    tombola = Aleatorio(1, Candidatos.Length);
                    Candidatos1 = tombola;
                    Console.Write($"Sorteo 1 Tombola {tombola} ");
                    Console.WriteLine($"El Ganador Es: {Candidatos[tombola]} = Gano: Q{Money}");

            Money = Aleatorionum1(200, 300);

            for (int i = 1; i <= Premios; i++)
                {
                    tombola = Aleatorio(1, Candidatos.Length);
                    if (tombola != Candidatos2)
                    {
                        if (tombola != Candidatos1)
                        {
                            
                            Console.Write($"Sorteo {i + 1} Tombola {tombola} ");
                            Candidatos2 = tombola;
                            Console.WriteLine($"El Ganador Es: {Candidatos[tombola]} = Gano: Q{Money}");
                            Money = Aleatorionum1(100, 200);
                        }
                    }
                }
        }
    }
}
