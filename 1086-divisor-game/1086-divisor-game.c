// bool helper(int n,bool turn)
// {
//     if(n<=0)
//       return !turn;
//     for(int i=2;i<=n;i++)
//     {
//         int q=n/i;
//         if(q>0)
//         {
//             int rem=n%q;
//             if(rem==0)
//             {
//                 return helper(n-q,!turn);
//             }
//         }
//         return !turn;
//     }
//     return !turn;
// }
bool divisorGame(int n) {
   // return helper(n,true);
   if(n%2==0)
     return true;
   return false;
}